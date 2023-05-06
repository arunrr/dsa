export function linear_search(haystack: Number[], needle: Number): boolean {
  for (let i = 0; i < haystack.length; ++i) {
    if (haystack[i] === needle) {
      return true;
    }
  }

  return false;
}
