import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Header from './components/Header';
import MovieCard from './components/MovieCard';
import ReviewCard from './components/ReviewCard';
import Footer from './components/Footer';
import './styles.css';  // Import the combined CSS file

const App = () => {
  const [movies, setMovies] = useState([]);
  const [reviews, setReviews] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const movieResponse = await axios.get('/api/movies');
        const reviewResponse = await axios.get('/api/reviews');
        setMovies(movieResponse.data);
        setReviews(reviewResponse.data);
        setLoading(false);
      } catch (error) {
        console.error("Error fetching data", error);
        setLoading(false);
      }
    };

    fetchData();
  }, []);

  if (loading) {
    return <div>Loading...</div>;
  }

  return (
    <div className="App">
      <Header />
      <div className="section">
        <h2 className="section-title">Top Recommended Movies</h2>
        <div className="movie-grid">
          {movies.map((movie) => (
            <MovieCard key={movie.id} title={movie.title} rating={movie.rating} />
          ))}
        </div>
      </div>
      <div className="section">
        <h2 className="section-title">Latest Reviews</h2>
        <div className="review-list">
          {reviews.map((review) => (
            <ReviewCard
              key={review.id}
              reviewer={review.reviewer}
              text={review.text}
              rating={review.rating}
            />
          ))}
        </div>
      </div>
      <Footer />
    </div>
  );
};

export default App;
