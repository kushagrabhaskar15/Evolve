import { Button } from "@headlessui/react";
import React from "react";

function CTASection() {
  return (
    <div className="bg-blue-50 h-[22rem] flex">
        <div className="w-fit relative mx-auto mt-[6rem] space-y-5">
            <div>
                <h4 className="text-5xl font-bold"><span className="text-red-700">Evolve</span> your habits, transform your life</h4>
            </div>
            <div className="space-x-2 relative">
                <Button className="border rounded p-2">LogIn</Button>
                <Button>SignUp</Button>
            </div>
        </div>
    </div>
  );
}

export default CTASection;
