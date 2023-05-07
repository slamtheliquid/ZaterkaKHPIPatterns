package Lab5;

class UserUpdater extends EntityUpdater {
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
}
