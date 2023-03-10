/*Let's write our own version as a get function. The function gets the value at path of object. If the resolved value is undefined, the defaultValue is returned in its place.*/
/**
 * @param {Object} object
 * @param {string|Array<string>} path
 * @param {*} defaultValue
 * @return {*}
 */
/**
 * divide path into fields
 * try access each field, if null then return defaultValue
 */
export default function get(object, path, defaultValue) {
  let pathArray = path;
  if (typeof path === "string") {
    pathArray = path.split(".");
  }
  if (object === undefined) {
    return defaultValue;
  }
  let currObj = object;
  for (let field of pathArray) {
    if (currObj[field] === undefined) {
      return defaultValue;
    }
    currObj = currObj[field];
  }
  return currObj;
}