package K0;

import J6.r;
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class b {
    public static final File a(Context context, String str) {
        r.e(context, "<this>");
        r.e(str, "name");
        return H0.a.a(context, r.k(str, ".preferences_pb"));
    }
}
