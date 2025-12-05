import React from 'react'
import ComponentsLayout from './ComponentsLayout'

function WhyUs() {
  return (
    <section id="WhyUs">
        <div className="font-serif font-semibold flex mx-auto justify-center my-15 text-3xl">
            <h4>Why Choose Evolve?</h4>
        </div>
        <div className="mx-auto flex space-x-12 justify-center my-10">
            <ComponentsLayout heading="Track habits smartly" img="src\assets\medal-svgrepo-com.svg" desc="No chaos. Just a neat dashboard where your routines actually make sense."/>
            <ComponentsLayout heading="Smart Reminders" desc="Not the annoying “drink water” every 2 min scene. Proper reminders, when you actually need them."/>
            <ComponentsLayout heading="Streaks & Rewards" desc="A little dopamine hit never hurt anyone. Keep going, stay winning."/>
            <ComponentsLayout heading="Progress you can flex" desc="Graphs, stats, and all that geeky stuff that proves you’re leveling up."/>
        </div>
    </section>
  )
}

export default WhyUs