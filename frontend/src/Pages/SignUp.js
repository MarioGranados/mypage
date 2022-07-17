import './Login.css';
import {useState} from "react";
import Navbar from "../Components/Navbar";
import Footer from "../Components/Footer";

const SignUp = () => {
    const [passwordMatch, setPasswordMatch] = useState(false);
    let handleForm = () => {

    }
    let handleSubmit = (passwordMatch) => {
        if (passwordMatch) {
            handleForm();
        }
    }

    return (
        <>
            <Navbar/>
            <div className='text-center justify-content-center d-flex align-content-center vh-100 b'>
                <div className="form-signin w-100 mx-auto">
                    <form >
                        <img className="mb-4" src="/docs/5.2/assets/brand/bootstrap-logo.svg" alt="" width="72"
                             height="57"/>
                        <h1 className="h3 mb-3 fw-normal">Create Your Page</h1>
                        <p className='lead'>No payment required</p>
                        {passwordMatch ? <p className='text-danger'>Passwords do not match</p> : null}

                        <div className="form-floating">
                            <input type="email" className="form-control" id="username" name='username'
                                   placeholder="mypage/username"/>
                            <label htmlFor="username">mypage/ username</label>
                        </div>

                        <div className="form-floating">
                            <input type="email" className="form-control" id="email" name='email'
                                   placeholder="name@example.com"/>
                            <label htmlFor="email">Email address</label>
                        </div>
                        <div className="form-floating">
                            <input type="password" className="form-control" id="password" name='password'
                                   placeholder="Password"/>
                            <label htmlFor="password">Password</label>
                        </div>

                        <div className="form-floating">
                            <input type="password" className="form-control" id="confirmPassword" name='confirmPassword'
                                   placeholder="Password"/>
                            <label htmlFor="confirmPassword">Confirm Password</label>
                        </div>

                        <div className="checkbox mb-3">
                            <label>
                                <input type="checkbox" value="remember-me"/> By creating an account you are agreeing to
                                our Terms and Conditions
                            </label>
                            <p className='mt-3'>View our privacy stuff here</p>
                        </div>
                        <button className="w-100 btn btn-lg btn-primary" type="submit">Register</button>
                        <p className="mt-5 mb-3 text-muted">&copy; 2022–2022</p>
                    </form>
                </div>
            </div>
            <Footer/>
        </>
    );
}
export default SignUp;
