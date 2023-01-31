public interface IMyImpl
{
    /**
     * Navigates to wanted URL.
     *
     * @param url URL to navigate to.
     */
    void navigate(String url);

    /**
     * Sets wanted string in to Google search.
     *
     * @param search String to search for.
     */
    void setSearch(String search);

    /**
     * Sends ENTER Key to Google search since the Search button is not interactable.
     */
    void executeSearch();

    /**
     * Check if google search result contains wanted phrase.
     *
     * @param check Phrase to check.
     * @return True if Google search contains wanted phrase otherwise false.
     */
    boolean searchExists(String check);

    /**
     * Rejecting cookies dialog on Google search.
     */
    void rejectCookies();
}
