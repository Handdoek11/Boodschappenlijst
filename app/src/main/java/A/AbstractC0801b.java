package a;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0801b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6512a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f6512a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
