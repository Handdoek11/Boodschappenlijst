package R4;

import J6.AbstractC0650j;
import android.util.Log;
import h2.AbstractC5830d;
import h2.C5829c;
import h2.InterfaceC5834h;
import h2.InterfaceC5836j;

/* renamed from: R4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0699g implements InterfaceC0700h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4871b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final H4.b f4872a;

    /* renamed from: R4.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public C0699g(H4.b bVar) {
        J6.r.e(bVar, "transportFactoryProvider");
        this.f4872a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(z zVar) {
        String b8 = A.f4763a.c().b(zVar);
        J6.r.d(b8, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event Type: " + zVar.b().name());
        byte[] bytes = b8.getBytes(S6.d.f5130b);
        J6.r.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // R4.InterfaceC0700h
    public void a(z zVar) {
        J6.r.e(zVar, "sessionEvent");
        ((InterfaceC5836j) this.f4872a.get()).a("FIREBASE_APPQUALITY_SESSION", z.class, C5829c.b("json"), new InterfaceC5834h() { // from class: R4.f
            @Override // h2.InterfaceC5834h
            public final Object apply(Object obj) {
                return this.f4870a.c((z) obj);
            }
        }).a(AbstractC5830d.f(zVar));
    }
}
