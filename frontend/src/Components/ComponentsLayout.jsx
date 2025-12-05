import React from 'react'

function ComponentsLayout(props) {
  return (
    <>
    <div className='h-[45vh] w-[20vw] border rounded-xl border-gray-400 p-4 shadow-md hover:shadow-lg transform-gpu will-change-transform transition-transform duration-300 ease-in-out hover:-translate-y-[2%] hover:scale-102 hover:cursor-pointer'>
        <div>
            <img src={props.img} className="my-[3vh] overflow-hidden h-[15vh] mx-auto rounded-2xl"></img>
        </div>
        <div className='mb-[2vh] mx-auto font-semibold text-2xl font-serif'>
            <h6>{props.heading}</h6>
        </div>
        <div className='mx-auto'>
            <p>{props.desc}</p>
        </div>
    </div>
    </>
  )
}

export default ComponentsLayout