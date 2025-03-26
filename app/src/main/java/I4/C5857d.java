package i4;

import H4.a;
import android.os.Bundle;
import e4.InterfaceC5746a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k4.C6103c;
import k4.C6104d;
import k4.C6105e;
import k4.C6106f;
import k4.InterfaceC6101a;
import l4.InterfaceC6173a;
import l4.InterfaceC6174b;

/* renamed from: i4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5857d {

    /* renamed from: a, reason: collision with root package name */
    private final H4.a f36513a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC6101a f36514b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC6174b f36515c;

    /* renamed from: d, reason: collision with root package name */
    private final List f36516d;

    public C5857d(H4.a aVar) {
        this(aVar, new l4.c(), new C6106f());
    }

    private void f() {
        this.f36513a.a(new a.InterfaceC0048a() { // from class: i4.c
            @Override // H4.a.InterfaceC0048a
            public final void a(H4.b bVar) {
                this.f36512a.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f36514b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(InterfaceC6173a interfaceC6173a) {
        synchronized (this) {
            try {
                if (this.f36515c instanceof l4.c) {
                    this.f36516d.add(interfaceC6173a);
                }
                this.f36515c.a(interfaceC6173a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(H4.b bVar) {
        j4.g.f().b("AnalyticsConnector now available.");
        InterfaceC5746a interfaceC5746a = (InterfaceC5746a) bVar.get();
        C6105e c6105e = new C6105e(interfaceC5746a);
        C5858e c5858e = new C5858e();
        if (j(interfaceC5746a, c5858e) == null) {
            j4.g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        j4.g.f().b("Registered Firebase Analytics listener.");
        C6104d c6104d = new C6104d();
        C6103c c6103c = new C6103c(c6105e, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator it = this.f36516d.iterator();
                while (it.hasNext()) {
                    c6104d.a((InterfaceC6173a) it.next());
                }
                c5858e.d(c6104d);
                c5858e.e(c6103c);
                this.f36515c = c6104d;
                this.f36514b = c6103c;
            } finally {
            }
        }
    }

    private static InterfaceC5746a.InterfaceC0252a j(InterfaceC5746a interfaceC5746a, C5858e c5858e) {
        InterfaceC5746a.InterfaceC0252a a8 = interfaceC5746a.a("clx", c5858e);
        if (a8 == null) {
            j4.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a8 = interfaceC5746a.a("crash", c5858e);
            if (a8 != null) {
                j4.g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a8;
    }

    public InterfaceC6101a d() {
        return new InterfaceC6101a() { // from class: i4.b
            @Override // k4.InterfaceC6101a
            public final void a(String str, Bundle bundle) {
                this.f36511a.g(str, bundle);
            }
        };
    }

    public InterfaceC6174b e() {
        return new InterfaceC6174b() { // from class: i4.a
            @Override // l4.InterfaceC6174b
            public final void a(InterfaceC6173a interfaceC6173a) {
                this.f36510a.h(interfaceC6173a);
            }
        };
    }

    public C5857d(H4.a aVar, InterfaceC6174b interfaceC6174b, InterfaceC6101a interfaceC6101a) {
        this.f36513a = aVar;
        this.f36515c = interfaceC6174b;
        this.f36516d = new ArrayList();
        this.f36514b = interfaceC6101a;
        f();
    }
}
