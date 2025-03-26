package kotlinx.serialization;

/* loaded from: classes2.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(String str) {
        super(str);
    }

    public UnknownFieldException(int i8) {
        this("An unknown field for index " + i8);
    }
}
