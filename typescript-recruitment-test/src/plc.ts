import { Category, DataType } from './types';

export const loadPlcTree = (filePath: string): Category => {
    // TODO: implements and replace the following line
    return {name: 'root', categories: [], measures: []};
};

/**
 *
 * @param category : category to search in
 * @param searchingString : string to search in measure name
 */
export const searchByName = (category: Category, searchingString: string): void => {
    // TODO
};

/**
 *
 * @param category : category to search in
 * @param dataType : dataType to search in measure
 */
export const searchByDataType = (category: Category, dataType: DataType): void => {
    // TODO
};
