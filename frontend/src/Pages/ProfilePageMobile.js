import {useEffect, useState} from "react";

const ProfilePageMobile = () => {
    let dog = []
    const [URL, setURL] = useState('')
    if(URL === '') {
        fetch('https://dog.ceo/api/breeds/image/random')
            .then((response) => response.json())
            .then((json) => dog.push(json)).then(() => {
            setURL(dog[0].message)
        })
    }
    const user = {
        userName: 'Mario',
        firstName: 'Mario',
        lastName: 'Granados',
        bio: "I'm a software developer",
        header: "I like to code",
    }
    const links = {
        title: 'title',
        url: 'https://facebook.com',
        desc: 'my personal facebook page',
        thumbnail:  URL,
    }
    return(
        <>
            <div className="container-fluid bg-dark vh-100">
                <div className="row">

                </div>
                <a href={links.url}><div className="row">
                    <div className="card mb-3 bg-dark text-white" >
                        <div className="row g-0">
                            <div className="col-md-2">
                                <img src={links.thumbnail} className="img-fluid rounded-start" alt={links.title + ' link'}/>
                            </div>
                            <div className="col-md-8">
                                <div className="card-body">
                                    <h5 className="card-title">{links.title}</h5>
                                    <p className="card-text">{links.desc}</p>
                                    <p className="card-text"><small className="text-white">{links.url}</small></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                </a>
                <div className="row justify-content-around align-content-center">
                    <div className="col">
                        <a href="#" className="btn btn-outline-light mt-3">{links.title}</a>
                    </div>
                    <div className="col">
                        <a href="#" className="btn btn-outline-light mt-3">{links.title}</a>
                    </div>
                    <div className="col">
                        <a href="#" className="btn btn-outline-light mt-3">{links.title}</a>
                    </div>
                    <div className="col">
                        <a href="#" className="btn btn-outline-light mt-3">{links.title}</a>
                    </div>
                </div>
            </div>
        </>
    );

}
export default ProfilePageMobile;
