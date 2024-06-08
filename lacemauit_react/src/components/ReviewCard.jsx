import React from 'react';

const ReviewCard = ({ reviewer, text, rating }) => {
  return (
    <div className="review-card">
      <div className="review-thumbnail"></div>
      <div className="review-content">
        <div className="reviewer-name">{reviewer}</div>
        <div className="review-text">{text}</div>
        <div className="rating">
          {Array.from({ length: 10 }, (_, i) => (
            <span key={i} className="star">
              {i < rating ? '⭐' : '☆'}
            </span>
          ))}
        </div>
      </div>
    </div>
  );
};

export default ReviewCard;
