export const compute = (chainA, chainB) => {
  
  if(!chainA && !chainB) {
    return 0;
  }

  const listA = Array.from(chainA);
  const listB = Array.from(chainB);

  if((chainA.length <= 0) && (chainB.length > 0)) {
    throw new Error('left strand must not be empty');
  }

  if((chainA.length > 0) && (chainB.length <= 0)) {
    throw new Error('right strand must not be empty');
  }

  if(listA.length > listB.length) {
    throw new Error('left and right strands must be of equal length');
  }

  if(listA.length < listB.length) {
    throw new Error('left and right strands must be of equal length');
  }
  
  
  let difference = 0;
  for (let count = 0; count < listA.length; count++) {
    if (listA[count] !== listB[count]) {
      difference++;
    }
  }
  return difference;
  //throw new Error("Remove this statement and implement this function");
};
