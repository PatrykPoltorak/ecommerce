export class Product {
    constructor(public sku: string,
        public name: string,
        public descripction: string,
        public unitePrice: number,
        public imageUrl: string,
        public active: boolean,
        public unitsInStock: number,
        public dateCreated: Date,
        public lastUpdate: Date
        ){

        }
}
