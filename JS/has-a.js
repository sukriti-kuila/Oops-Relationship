class Processor {
    constructor(brand, model) {
        this.brand = brand;
        this.model = model;
    }
}

class Mobile {
    constructor(brand, model, processor) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
    }
    getProcessor() {
        return this.processor;
    }
}

const processor = new Processor("Intel", "Core i7");
const mobile = new Mobile("Phone", "xyz model", processor);
const mobileProcessor = mobile.getProcessor();
console.log(mobile);
