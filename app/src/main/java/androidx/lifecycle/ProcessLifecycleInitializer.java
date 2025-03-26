package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.v;
import i1.InterfaceC5847a;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC5847a {
    @Override // i1.InterfaceC5847a
    public List a() {
        return AbstractC6987o.e();
    }

    @Override // i1.InterfaceC5847a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0927m b(Context context) {
        J6.r.e(context, "context");
        androidx.startup.a e8 = androidx.startup.a.e(context);
        J6.r.d(e8, "getInstance(context)");
        if (!e8.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C0924j.a(context);
        v.b bVar = v.f10332z;
        bVar.b(context);
        return bVar.a();
    }
}
