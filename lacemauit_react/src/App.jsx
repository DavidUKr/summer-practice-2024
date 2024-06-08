import React from 'react';
import './styles.css';
import Header from './components/Header';
import MovieCard from './components/MovieCard';
import ReviewCard from './components/ReviewCard';
import Footer from './components/Footer';

const App = () => {
  const recommendedMovies = [
    { title: 'Inception', rating: 6.8 },
    { title: 'The Matrix', rating: 8.9 },
    // Add more movies as needed
  ];

  const latestReviews = [
    {
      reviewer: 'DannMoore73',
      text: 'This was not so good. I still gave it a solid 6/10 because I loved the cast',
      rating: 6,
    },
    // Add more reviews as needed
  ];

  return (
    <div className="App">
      <Header />
      <section className="section">
        <h2 className="section-title">Top Recommended Movies</h2>
        <div className="movie-grid">
          {recommendedMovies.map((movie, index) => (
            <MovieCard key={index} title={movie.title} rating={movie.rating} />
          ))}
        </div>
      </section>
      <section className="section">
        <h2 className="section-title">Latest Reviews</h2>
        <div className="review-list">
          {latestReviews.map((review, index) => (
            <ReviewCard key={index} reviewer={review.reviewer} text={review.text} rating={review.rating} />
          ))}
        </div>
      </section>
      <Footer />
    </div>
  );
};

export default App;
