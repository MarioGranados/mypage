import './Login.css';
import {useEffect, useState} from "react";
import Navbar from "../Components/Navbar";
import Footer from "../Components/Footer";
import Users, {createUser} from "../Components/Utils";


const SignUp = () => {

    const [passwordMatch, setPasswordMatch] = useState(false);
    const [email, setEmail] = useState('')
    const [password, setPassword] = useState('');
    const [confirmPassword, setConfirmPassword] = useState('');
    const [username, setUsername] = useState('');


    let handleSubmit = (e) => {
        e.preventDefault();
        let user = {
            username: username,
            email: email,
            password: password,
        }
        console.log(user);

        createUser(user)
    }


    return (
        <>
            <Navbar/>
            <div className='text-center justify-content-center d-flex align-content-center vh-100 b'>
                <div className="form-signin w-100 mx-auto">
                    <form onSubmit={handleSubmit}>
                        <img className="mb-4" src="/docs/5.2/assets/brand/bootstrap-logo.svg" alt="" width="72"
                             height="57"/>
                        <h1 className="h3 mb-3 fw-normal">Create Your Page</h1>
                        <p className='lead'>No payment required</p>
                        {passwordMatch ? <p className='text-danger'>Passwords do not match</p> : null}

                        <div className="form-floating">
                            <input type="text" className="form-control" id="username" name='username'
                                   required
                                   placeholder="mypage/username"
                                   onChange={(e) => {
                                       setUsername(e.target.value);
                                   }}
                            />
                            <label htmlFor="username">mypage/ username</label>
                        </div>

                        <div className="form-floating">
                            <input type="email" className="form-control" id="email" name='email'
                                   required
                                   placeholder="name@example.com"
                                   onChange={(e) => {
                                       setEmail(e.target.value);
                                   }}
                            />
                            <label htmlFor="email">Email address</label>
                        </div>
                        <div className="form-floating">
                            <input type="password" className="form-control" id="password" name='password'
                                   required
                                   placeholder="Password"
                                   onChange={(e) => {setPassword(e.target.value)}}
                            />
                            <label htmlFor="password">Password</label>
                        </div>

                        <div className="form-floating">
                            <input type="password" className="form-control" id="confirmPassword" name='confirmPassword'
                                   required
                                   placeholder="Password"
                                   onChange={(e) => {
                                       setConfirmPassword(e.target.value);
                                   }}
                            />
                            <label htmlFor="confirmPassword">Confirm Password</label>
                        </div>

                        <div className="checkbox mb-3">
                            <label>
                                <input type="checkbox" value="remember-me"/> By creating an account you are agreeing to
                                our Terms and Conditions
                            </label>
                            <p className='mt-3'>View our privacy stuff here</p>
                        </div>
                        <button className="w-100 btn btn-lg btn-primary" type={"submit"}>Register</button>
                        <p className="mt-5 mb-3 text-muted">&copy; 2022–2022</p>
                    </form>
                </div>
            </div>
            <Footer/>
        </>
    );
}
export default SignUp;
