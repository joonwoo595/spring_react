import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import React from "react";
import Header from "./pages/layout/Header.jsx";
import Nav from "./pages/layout/Nav.jsx"
import Footer from "./pages/layout/Footer.jsx";
import Main from "./pages/Main.jsx";
import './styles/App.css'

function App() {


    return (
        <>
            <Header/>
            <Nav/>
            <Main/>
            <Footer/>
        </>
    )
}

export default App
