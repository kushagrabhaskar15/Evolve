import React from 'react'
import CTASection from '../Components/CTASection'
import Navbar from '../Components/Navbar'
import WhyUs from '../Components/WhyUs'
import Footer from '../Components/Footer'

function LandingPage() {
  return (
    <div className="scroll-smooth">
        <Navbar/>
        <CTASection/>
        <WhyUs/>
        <Footer/>
    </div>
  )
}

export default LandingPage