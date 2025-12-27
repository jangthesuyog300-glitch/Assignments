using System;


namespace ST
{
    [AttributeUsage(AttributeTargets.Class)]
    public class SuyogTransport:Attribute
    {
		private string _owenrName;
		private string _company;

		public string Company
		{
			get { return _company; }
			set { _company = value; }
		}


		public string Owername
		{
			get { return _owenrName; }
			set { _owenrName = value; }
		}


	}
}
