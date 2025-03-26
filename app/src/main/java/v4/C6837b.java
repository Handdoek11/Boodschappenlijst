package v4;

/* renamed from: v4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6837b implements InterfaceC6839d {

    /* renamed from: a, reason: collision with root package name */
    private final int f44088a;

    public C6837b(int i8) {
        this.f44088a = i8;
    }

    @Override // v4.InterfaceC6839d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i8 = this.f44088a;
        if (length <= i8) {
            return stackTraceElementArr;
        }
        int i9 = i8 / 2;
        int i10 = i8 - i9;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i8];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i10);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i9, stackTraceElementArr2, i10, i9);
        return stackTraceElementArr2;
    }
}
