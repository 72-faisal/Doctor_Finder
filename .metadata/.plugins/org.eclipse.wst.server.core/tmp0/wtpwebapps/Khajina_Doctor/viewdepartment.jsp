<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Photo Slider with Text Fields</title>
  <!-- Include Swiper library CSS file -->
  <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
  <style>
    /* Set height of photo slider to fill available space */
    .photo-slider {
      height: 100vh;
    }
    /* Set height of text fields to match height of photo slider */
    .text-fields {
      height: 100vh;
      display: flex;
      flex-direction: column;
      justify-content: center;
    }
    /* Style for text field labels */
    label {
      display: block;
      font-weight: bold;
      margin-bottom: 10px;
    }
    /* Style for text field inputs */
    input[type=text] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      box-sizing: border-box;
      border: 2px solid #ccc;
      border-radius: 4px;
      background-color: #f8f8f8;
      font-size: 16px;
    }
    /* Style for submit button */
    input[type=submit] {
      background-color: #4CAF50;
      color: white;
      padding: 12px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
  </style>
</head>
<body>
  <!-- Photo slider on left side -->
  <div class="photo-slider">
    <div class="swiper-container">
      <div class="swiper-wrapper">
        <div class="swiper-slide"><img src="https://picsum.photos/id/1015/800/600"></div>
        <div class="swiper-slide"><img src="https://picsum.photos/id/1016/800/600"></div>
        <div class="swiper-slide"><img src="https://picsum.photos/id/1018/800/600"></div>
        <div class="swiper-slide"><img src="https://picsum.photos/id/1020/800/600"></div>
      </div>
      <div class="swiper-pagination"></div>
      <div class="swiper-button-next"></div>
      <div class="swiper-button-prev"></div>
    </div>
  </div>
  
  <!-- Text fields on right side -->
  <div class="text-fields">
    <form>
      <label for="name">Name:</label>
      <input type="text" id="name" name="name" placeholder="Enter your name">
      
      <label for="email">Email:</label>
      <input type="text" id="email" name="email" placeholder="Enter your email address">
      
      <label for="message">Message:</label>
      <textarea id="message" name="message" rows="6" placeholder="Enter your message"></textarea>
      
      <input type="submit" value="Submit">
    </form>
  </div>

  <!-- Include Swiper library JavaScript file -->
  <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
  <script>
    // Initialize Swiper library
    var swiper = new Swiper('.swiper-container', {
      // Configure swiper to enable horizontal slide movement
      direction: 'horizontal',
      // Enable automatic slide movement
      autoplay: {
        delay: 5000,
      }


	</script>
</body>
</html>