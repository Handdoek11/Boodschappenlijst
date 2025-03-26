package d;

import J6.AbstractC0650j;
import J6.r;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g implements Parcelable {

    /* renamed from: o, reason: collision with root package name */
    private final IntentSender f35183o;

    /* renamed from: s, reason: collision with root package name */
    private final Intent f35184s;

    /* renamed from: t, reason: collision with root package name */
    private final int f35185t;

    /* renamed from: u, reason: collision with root package name */
    private final int f35186u;

    /* renamed from: v, reason: collision with root package name */
    public static final c f35182v = new c(null);
    public static final Parcelable.Creator<g> CREATOR = new b();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final IntentSender f35187a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f35188b;

        /* renamed from: c, reason: collision with root package name */
        private int f35189c;

        /* renamed from: d, reason: collision with root package name */
        private int f35190d;

        public a(IntentSender intentSender) {
            r.e(intentSender, "intentSender");
            this.f35187a = intentSender;
        }

        public final g a() {
            return new g(this.f35187a, this.f35188b, this.f35189c, this.f35190d);
        }

        public final a b(Intent intent) {
            this.f35188b = intent;
            return this;
        }

        public final a c(int i8, int i9) {
            this.f35190d = i8;
            this.f35189c = i9;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            r.e(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            r.d(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            r.e(parcel, "inParcel");
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i8) {
            return new g[i8];
        }
    }

    public static final class c {
        public /* synthetic */ c(AbstractC0650j abstractC0650j) {
            this();
        }

        private c() {
        }
    }

    public g(IntentSender intentSender, Intent intent, int i8, int i9) {
        r.e(intentSender, "intentSender");
        this.f35183o = intentSender;
        this.f35184s = intent;
        this.f35185t = i8;
        this.f35186u = i9;
    }

    public final Intent a() {
        return this.f35184s;
    }

    public final int b() {
        return this.f35185t;
    }

    public final int c() {
        return this.f35186u;
    }

    public final IntentSender d() {
        return this.f35183o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        r.e(parcel, "dest");
        parcel.writeParcelable(this.f35183o, i8);
        parcel.writeParcelable(this.f35184s, i8);
        parcel.writeInt(this.f35185t);
        parcel.writeInt(this.f35186u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Parcel parcel) {
        r.e(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        r.b(readParcelable);
        this((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
