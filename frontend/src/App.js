import HomePage from './Pages/HomePage'
import 'bootstrap/dist/js/bootstrap';
import 'bootstrap/dist/css/bootstrap.css';
import ProfilePage from "./Pages/ProfilePage";
import Login from "./Pages/Login";
import SignUp from "./Pages/SignUp";
import {
    BrowserRouter,
    Routes,
    Route,
    Link,
} from "react-router-dom";

function App() {
  return (
      <BrowserRouter>
          <Routes>
              <Route path="/" element={<HomePage />} />
              <Route path="/login" element={<Login />} />
              <Route path="/signup" element={<SignUp />} />
              <Route path="/profile" element={<ProfilePage />} />
          </Routes>
      </BrowserRouter>
  );
}

export default App;
