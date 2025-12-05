import { useState } from 'react'
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import './App.css'
import LandingPage from './pages/LandingPage';
import Account from './pages/Account';

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <Router>
      <Routes>
        <Route path="/" element={<LandingPage/>}/>
        <Route path="/account" element={<Account/>}/>
      </Routes>
    </Router>
    </>
  )
}

export default App
