import React from 'react';
import '../styles/Header.css';

const Header = () => {
  return (
    <header className="header">
      <div className="logo">🎬 Movie Ratings 🎥</div>
      <div className="user-profile">
        <div>icon</div>
        <div className="user-name">DavidUrs</div>
      </div>
    </header>
  );
};

export default Header;
