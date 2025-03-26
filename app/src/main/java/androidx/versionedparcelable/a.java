package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import q.C6397a;

/* loaded from: classes.dex */
class a extends VersionedParcel {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f11696d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f11697e;

    /* renamed from: f, reason: collision with root package name */
    private final int f11698f;

    /* renamed from: g, reason: collision with root package name */
    private final int f11699g;

    /* renamed from: h, reason: collision with root package name */
    private final String f11700h;

    /* renamed from: i, reason: collision with root package name */
    private int f11701i;

    /* renamed from: j, reason: collision with root package name */
    private int f11702j;

    /* renamed from: k, reason: collision with root package name */
    private int f11703k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C6397a(), new C6397a(), new C6397a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f11697e.writeInt(-1);
        } else {
            this.f11697e.writeInt(bArr.length);
            this.f11697e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f11697e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i8) {
        this.f11697e.writeInt(i8);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f11697e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f11697e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i8 = this.f11701i;
        if (i8 >= 0) {
            int i9 = this.f11696d.get(i8);
            int dataPosition = this.f11697e.dataPosition();
            this.f11697e.setDataPosition(i9);
            this.f11697e.writeInt(dataPosition - i9);
            this.f11697e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f11697e;
        int dataPosition = parcel.dataPosition();
        int i8 = this.f11702j;
        if (i8 == this.f11698f) {
            i8 = this.f11699g;
        }
        return new a(parcel, dataPosition, i8, this.f11700h + "  ", this.f11693a, this.f11694b, this.f11695c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f11697e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int readInt = this.f11697e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f11697e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f11697e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i8) {
        while (this.f11702j < this.f11699g) {
            int i9 = this.f11703k;
            if (i9 == i8) {
                return true;
            }
            if (String.valueOf(i9).compareTo(String.valueOf(i8)) > 0) {
                return false;
            }
            this.f11697e.setDataPosition(this.f11702j);
            int readInt = this.f11697e.readInt();
            this.f11703k = this.f11697e.readInt();
            this.f11702j += readInt;
        }
        return this.f11703k == i8;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f11697e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable q() {
        return this.f11697e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f11697e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i8) {
        a();
        this.f11701i = i8;
        this.f11696d.put(i8, this.f11697e.dataPosition());
        E(0);
        E(i8);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z7) {
        this.f11697e.writeInt(z7 ? 1 : 0);
    }

    private a(Parcel parcel, int i8, int i9, String str, C6397a c6397a, C6397a c6397a2, C6397a c6397a3) {
        super(c6397a, c6397a2, c6397a3);
        this.f11696d = new SparseIntArray();
        this.f11701i = -1;
        this.f11703k = -1;
        this.f11697e = parcel;
        this.f11698f = i8;
        this.f11699g = i9;
        this.f11702j = i8;
        this.f11700h = str;
    }
}
