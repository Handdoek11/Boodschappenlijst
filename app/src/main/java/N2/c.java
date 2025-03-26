package N2;

import android.net.Uri;
import com.google.android.gms.internal.ads.AbstractC2643fg;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f4096a = (String) AbstractC2643fg.f22091a.e();

    public String a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f4096a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
