package V2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends AbstractC0813a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: o, reason: collision with root package name */
    final Intent f5557o;

    public a(Intent intent) {
        this.f5557o = intent;
    }

    public Intent A0() {
        return this.f5557o;
    }

    public String B0() {
        String stringExtra = this.f5557o.getStringExtra("google.message_id");
        return stringExtra == null ? this.f5557o.getStringExtra("message_id") : stringExtra;
    }

    final Integer C0() {
        if (this.f5557o.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f5557o.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 1, this.f5557o, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
