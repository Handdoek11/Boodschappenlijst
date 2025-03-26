package H0;

import J6.r;
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class a {
    public static final File a(Context context, String str) {
        r.e(context, "<this>");
        r.e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), r.k("datastore/", str));
    }
}
