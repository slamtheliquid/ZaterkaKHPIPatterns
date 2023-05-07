package Lab5;

class ProductUpdater extends EntityUpdater {
    @Override
    protected Object retrieveEntity() {
        return new Object();
    }

    @Override
    protected boolean validateEntity(Object entity) {
        boolean isValid = super.validateEntity(entity);
        return isValid;
    }

    @Override
    protected void sendUpdateRequest(Object entity) {
    }

    @Override
    protected void onValidationFailed(Object entity) {
    }
}
