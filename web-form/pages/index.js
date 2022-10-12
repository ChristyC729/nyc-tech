import styles from '../styles/Home.module.css'

export default function Start() {

    const onSubmit = async (event)=> {
        
        event.preventDefault()
        const data=[...event.target["choices[]"]].map(input => input.value.toLowerCase());

        if (data.includes('calculus')){
            const response = await fetch('/api/courses', {
                body: JSON.stringify(data),
                method: 'POST',
            });
          return await console.log(response.json()), alert("Form Submitted");
        }
        else alert("One course must include Calculus");
    }


    return (
        <div className={styles.container}>
            <main className={styles.main}>
                <h1 className={styles.title}>
                Choose your courses here: 
                </h1>
                <div className={styles.grid}>
                    <form onSubmit={onSubmit}>
                        Choice A: <input type="text" name="choices[]"/>
                        Choice B: <input type="text" name="choices[]"/>
                        Choice C: <input type="text" name="choices[]"/>
                        <input type="submit" value="Submit"/>
                    </form>
                </div>
            </main>
        </div>
    )
}