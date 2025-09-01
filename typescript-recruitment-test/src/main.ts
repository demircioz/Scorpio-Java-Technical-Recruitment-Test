import { loadPlcTree, searchByDataType, searchByName } from './plc';
import { DataType } from './types';

const main = (): void => {
    const filePath = __dirname + '/../../resources/plcTree.json';
    const category = loadPlcTree(filePath);
    searchByName(category, 'Piece-counter');
    searchByDataType(category, DataType.BOOLEAN);
};

main();
