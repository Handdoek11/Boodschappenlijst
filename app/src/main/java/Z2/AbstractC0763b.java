package Z2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: Z2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0763b {
    public static ApiException a(Status status) {
        return status.D0() ? new ResolvableApiException(status) : new ApiException(status);
    }
}
