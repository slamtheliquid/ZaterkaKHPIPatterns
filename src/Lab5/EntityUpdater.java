package Lab5;

abstract class EntityUpdater {
    public void updateEntity() {
        Object entity = retrieveEntity();
        if (validateEntity(entity)) {
            sendUpdateRequest(entity);
            Object response = createResponse(entity);
            processResponse(response);
        } else {
            onValidationFailed(entity);
        }
    }

    protected abstract Object retrieveEntity();
    protected abstract void sendUpdateRequest(Object entity);
    protected boolean validateEntity(Object entity) {
        return true;
    }

    protected Object createResponse(Object entity) {
        return null;
    }

    protected void processResponse(Object response) {
    }

    protected void onValidationFailed(Object entity) {
    }
}
