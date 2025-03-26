package v4;

/* renamed from: v4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6836a implements InterfaceC6839d {

    /* renamed from: a, reason: collision with root package name */
    private final int f44085a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6839d[] f44086b;

    /* renamed from: c, reason: collision with root package name */
    private final C6837b f44087c;

    public C6836a(int i8, InterfaceC6839d... interfaceC6839dArr) {
        this.f44085a = i8;
        this.f44086b = interfaceC6839dArr;
        this.f44087c = new C6837b(i8);
    }

    @Override // v4.InterfaceC6839d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f44085a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (InterfaceC6839d interfaceC6839d : this.f44086b) {
            if (stackTraceElementArr2.length <= this.f44085a) {
                break;
            }
            stackTraceElementArr2 = interfaceC6839d.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f44085a ? this.f44087c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
