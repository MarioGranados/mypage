const ProfilePageMobile = () => {
    const user = {
        userName: 'Mario',
        firstName: 'Mario',
        lastName: 'Granados',
        bio: "I'm a software developer",
        header: "I like to code",
    }
    const links = {
        title: 'title',
        url: 'url',
        desc: 'desc',
        thumbnail: 'thumbnail'
    }
    return(
        <>
            <div className="container-fluid bg-dark vh-100">
                <div className="row">

                </div>
                <div className="row">
                    <a href="#" className="btn btn-outline-light mt-3">{links.title}</a>
                    <a href="#" className="btn btn-outline-light mt-3">{links.title}</a>
                    <a href="#" className="btn btn-outline-light mt-3">{links.title}</a>
                    <a href="#" className="btn btn-outline-light mt-3">{links.title}</a>
                    <a href="#" className="btn btn-outline-light mt-3">{links.title}</a>
                </div>
                <div className="row">

                </div>
            </div>
        </>
    );

}
export default ProfilePageMobile;
