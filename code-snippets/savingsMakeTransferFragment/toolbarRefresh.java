// handles the refresh button in the toolbar to reload the current fragment:

@Override
public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == R.id.menu_refresh_transfer) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        Fragment currFragment = getActivity().getSupportFragmentManager().findFragmentById(R.id.container);
        transaction.detach(currFragment).attach(currFragment).commit();
    }
    return super.onOptionsItemSelected(item);
}
