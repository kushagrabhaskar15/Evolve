import React from 'react'

function ComponentsLayout(props) {
  return (
    <div className='h-[25rem] w-[20rem] border rounded-xl border-gray-400 p-4'>
        <div>
            <img src={props.img} className=" overflow-hidden h-[10rem] mx-auto rounded-2xl"></img>
        </div>
        <div className='mx-auto font-semibold text-3xl font-serif'>
            <h6>{props.heading}</h6>
        </div>
        <div>
            <p>{props.desc}</p>
        </div>
    </div>
  )
}

export default ComponentsLayout