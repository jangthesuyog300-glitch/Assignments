import React from "react";
import {
    BrowserRouter, Routes, Route, NavLink
} from "react-router-dom";
import Home from "./Home";
import About from "./About";
import Contact from "./Contact";
import LoginDemo from "./LoginDemo"; 

const App1 = () => {
    return (
        <BrowserRouter>
            <nav>
                <ul>
                    <li>
                        <NavLink to="/" end>
                            Home
                        </NavLink>
                    </li>
                    <li>
                        <NavLink to="/About">
                            About Us
                        </NavLink>
                    </li>
                    <li>
                        <NavLink to="/Contact">
                            Contact Us
                        </NavLink>
                    </li>
                    <li>
                        <NavLink to="/LoginDemo">
                            Login
                        </NavLink>
                    </li>
                </ul>
            </nav>

            <div>
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/About" element={<About />} />
                    <Route path="/Contact" element={<Contact />} />
                    <Route path="/LoginDemo" element={<LoginDemo />} />
                </Routes>
            </div>
        </BrowserRouter>
    );
};

export default App1;