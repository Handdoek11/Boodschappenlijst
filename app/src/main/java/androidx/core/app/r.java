package androidx.core.app;

import android.app.RemoteInput;

/* loaded from: classes.dex */
public abstract class r {

    static class a {
        public static RemoteInput a(r rVar) {
            throw null;
        }
    }

    static RemoteInput a(r rVar) {
        return a.a(rVar);
    }

    static RemoteInput[] b(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[rVarArr.length];
        for (int i8 = 0; i8 < rVarArr.length; i8++) {
            r rVar = rVarArr[i8];
            remoteInputArr[i8] = a(null);
        }
        return remoteInputArr;
    }
}
