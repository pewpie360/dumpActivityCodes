import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <div>
      
      <form action="" method="get">
      <span style={{color: 'black', backgroundColor: 'lime',fontWeight: 'bold'}}>LOGIN<br></br></span>{' '}
      <input type="text" placeholder="Enter username" />
      <br></br>
      <label class="PASSWORD"></label>
      <input type="text" placeholder="Enter password" />
      <br></br>
      <input type="button" value="LOGIN" />
      <br></br>
      <input type="button" value="SIGNUP" />
     

      </form>

    </div>

    </>
  )
}

export default App
