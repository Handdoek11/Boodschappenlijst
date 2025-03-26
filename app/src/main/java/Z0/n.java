package Z0;

import J6.AbstractC0650j;
import J6.r;
import U6.C0733p;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import v0.t;
import x6.C6916E;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6158a = new b(null);

    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        public final n a(Context context) {
            r.e(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            V0.b bVar = V0.b.f5503a;
            sb.append(bVar.a());
            Log.d("MeasurementManager", sb.toString());
            if (bVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        private b() {
        }
    }

    public abstract Object a(Z0.a aVar, A6.d dVar);

    public abstract Object b(A6.d dVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, A6.d dVar);

    public abstract Object d(Uri uri, A6.d dVar);

    public abstract Object e(o oVar, A6.d dVar);

    public abstract Object f(p pVar, A6.d dVar);

    private static final class a extends n {

        /* renamed from: b, reason: collision with root package name */
        private final MeasurementManager f6159b;

        public a(MeasurementManager measurementManager) {
            r.e(measurementManager, "mMeasurementManager");
            this.f6159b = measurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest k(Z0.a aVar) {
            k.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(o oVar) {
            l.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(p pVar) {
            c.a();
            throw null;
        }

        @Override // Z0.n
        public Object a(Z0.a aVar, A6.d dVar) {
            C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
            c0733p.C();
            this.f6159b.deleteRegistrations(k(aVar), new m(), t.a(c0733p));
            Object z7 = c0733p.z();
            if (z7 == B6.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return z7 == B6.b.e() ? z7 : C6916E.f44463a;
        }

        @Override // Z0.n
        public Object b(A6.d dVar) {
            C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
            c0733p.C();
            this.f6159b.getMeasurementApiStatus(new m(), t.a(c0733p));
            Object z7 = c0733p.z();
            if (z7 == B6.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return z7;
        }

        @Override // Z0.n
        public Object c(Uri uri, InputEvent inputEvent, A6.d dVar) {
            C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
            c0733p.C();
            this.f6159b.registerSource(uri, inputEvent, new m(), t.a(c0733p));
            Object z7 = c0733p.z();
            if (z7 == B6.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return z7 == B6.b.e() ? z7 : C6916E.f44463a;
        }

        @Override // Z0.n
        public Object d(Uri uri, A6.d dVar) {
            C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
            c0733p.C();
            this.f6159b.registerTrigger(uri, new m(), t.a(c0733p));
            Object z7 = c0733p.z();
            if (z7 == B6.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return z7 == B6.b.e() ? z7 : C6916E.f44463a;
        }

        @Override // Z0.n
        public Object e(o oVar, A6.d dVar) {
            C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
            c0733p.C();
            this.f6159b.registerWebSource(l(oVar), new m(), t.a(c0733p));
            Object z7 = c0733p.z();
            if (z7 == B6.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return z7 == B6.b.e() ? z7 : C6916E.f44463a;
        }

        @Override // Z0.n
        public Object f(p pVar, A6.d dVar) {
            C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
            c0733p.C();
            this.f6159b.registerWebTrigger(m(pVar), new m(), t.a(c0733p));
            Object z7 = c0733p.z();
            if (z7 == B6.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return z7 == B6.b.e() ? z7 : C6916E.f44463a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Context context) {
            r.e(context, "context");
            Object systemService = context.getSystemService((Class<Object>) f.a());
            r.d(systemService, "context.getSystemService…:class.java\n            )");
            this(g.a(systemService));
        }
    }
}
