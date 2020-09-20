/**
 * Parameters properties demo..for removing boilar plate code.
 */
export class Customers{
   
    constructor(private _firstName: string, private _lastName: string){

    }
    public get lastName(): string {
        return this._lastName;
    }
    public set lastName(value: string) {
        this._lastName = value;
    }
    public get firstName(): string {
        return this._firstName;
    }
    public set firstName(value: string) {
        this._firstName = value;
    }
}