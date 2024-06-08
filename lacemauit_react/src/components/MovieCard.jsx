import React from 'react';

const MovieCard = ({ title, rating }) => {
  return (
    <div className="movie-card">
      <div className="thumbnail"></div>
      <h3>{title}</h3>
      <div className="rating">
        {Array.from({ length: 10 }, (_, i) => (
          <span key={i} className="star">
            {i < rating ? '⭐' : '☆'}
          </span>
        ))}
      </div>
    </div>
  );
};

export default MovieCard;
