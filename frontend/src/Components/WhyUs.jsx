import React from 'react'
import ComponentsLayout from './ComponentsLayout'

function WhyUs() {
  return (
    <section id="WhyUs">
        <div className="font-serif font-semibold flex mx-auto justify-center my-15 text-3xl">
            <h4>Why Choose Evolve?</h4>
        </div>
        <div className="mx-auto flex space-x-12 justify-center my-10">
            <ComponentsLayout heading="testing" img="src\assets\medal-svgrepo-com.svg" desc="Lorem ipsum dolor sit amet consectetur adipisicing elit!"/>
            <ComponentsLayout heading="testing"/>
            <ComponentsLayout heading="testing"/>
            <ComponentsLayout heading="testing"/>
        </div>
    </section>
  )
}

export default WhyUs