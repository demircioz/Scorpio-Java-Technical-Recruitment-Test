export type Category = {
    id?: number;
    name: string;
    categories: Category[];
    measures: Measure[];
};

export type Measure = {
    id?: number;
    name: string;
    dataType: DataType;
};

export enum DataType {
    SHORT = 'Short',
    INTEGER = 'Integer',
    LONG = 'Long',
    FLOAT = 'Float',
    DOUBLE = 'Double',
    BOOLEAN = 'Boolean',
    STRING = 'String'
}

