import React from 'react'
import Navbar from '../Components/Navbar'

function Account() {
  return (
    <div className='flex max-w-screen-xl'>
        <section className='w-[30vw] h-[100vh] p-4 md:p-8 lg:p-12 bg-gray-100'>
            <div className='rounded-full h-[30vh] w-[30vh] overflow-hidden mx-auto bg-white'>
                <img src="#" alt='profile photo'></img>
            </div>
            <div className="my-[5vh]">
                <p className='block font-bold font-serif mx-auto bg-white text-2xl my-[2vh]'>Name</p>
                {/* Include Bio */}
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Beatae ratione reprehenderit necessitatibus doloribus ducimus culpa.
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis, eos vero. Enim praesentium unde ducimus obcaecati voluptatem sunt reprehenderit, maiores dicta eaque, sed amet temporibus vitae odio. Tempora, et ipsa!
                </p>
            </div>
        </section>
        <section className='bg-gray-50 w-full flex'>
            <section className=''>
                <p className='text-5xl font-bold font-serif mt-10 ml-15'>Dashboard</p>
                <section className='flex border p-8 w-[50vw] m-8 rounded-lg bg-white ml-15 shadow-lg'>
                    <div className='border h-[18vh] w-[13vw] p-4 rounded shadow m-4'>Current Streak</div>
                    <div className='border h-[18vh] w-[13vw] p-4 rounded shadow m-4'>Max Streak</div>
                    <div className='border h-[18vh] w-[13vw] p-4 rounded shadow m-4'>Rank</div>
                </section>
                <section className='flex'>
                    <div>

                    </div>
                    <div>

                    </div>
                </section>
            </section>
            <section className='ml-15 bg-black flex-grow overflow-hidden'>
                hello
            </section>
        </section>
    </div>
  )
}

export default Account