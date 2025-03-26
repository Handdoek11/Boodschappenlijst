package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.k;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f9178a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f9179b = new Object();

    static Bundle a(k.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d8 = aVar.d();
        bundle.putInt("icon", d8 != null ? d8.e() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(r rVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[rVarArr.length];
        for (int i8 = 0; i8 < rVarArr.length; i8++) {
            r rVar = rVarArr[i8];
            bundleArr[i8] = b(null);
        }
        return bundleArr;
    }
}
