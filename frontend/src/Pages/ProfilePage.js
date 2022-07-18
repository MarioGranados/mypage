
import './ProfilePage.css'

const ProfilePage = () => {
    const user = {
        userName: 'Mario',
        firstName: 'Mario',
        lastName: 'Granados',
        bio: "I'm a software developer",
        header: "I like to code",
    }
    const appearance = {
        backgroundColor: ''
    }
    return(
        <>
            <div className="d-flex vh-100 text-center text-white bg-dark" style={appearance}>

            <div className="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
                <header className="mb-auto">
                    <div>
                        <a href="/profile" className='nav-link fw-bold'><h3 className="float-md-start mb-0">{user.userName}</h3></a>
                        <nav className="nav nav-masthead justify-content-center float-md-end">
                            <a className="nav-link fw-bold py-1 px-0 active" aria-current="page" href="/profile">Home</a>
                            <a className="nav-link fw-bold py-1 px-0" href="/links">Features</a>
                            <a className="nav-link fw-bold py-1 px-0" href="/links">SocialMedia</a>
                        </nav>
                    </div>
                </header>

                <main className="px-3">
                    <h1>{user.header}</h1>
                    <p className="lead">{user.bio}</p>
                    <p className="lead">
                        <a href="/links" className="btn btn-lg btn-secondary fw-bold border-white bg-white">Learn more</a>
                    </p>
                </main>

                <footer className="mt-auto text-white-50">
                    <p>Create Your Own Page <a href="/signup" className="text-white">Here</a>,
                        by <a href="/" className="text-white">MyPage</a>.</p>
                </footer>
            </div>


            </div>
        </>
    );
}
export default ProfilePage;
